package com.qhieco.apiservice.redis.utils;

import org.springframework.data.redis.serializer.RedisSerializer;

import java.nio.charset.Charset;

/**
 * 自定义String序列化反序列化类，
 * 避免org.springframework.data.redis.serializer.StringRedisSerializer在传人参数不是String类型时抛出异常
 * @author wangyu
 */
public class MyStringRedisSerializer implements RedisSerializer<Object> {

	private final Charset charset;

	public MyStringRedisSerializer() {
		this(Charset.forName("UTF8"));
	}

	public MyStringRedisSerializer(Charset charset) {
		this.charset = charset;
	}

	@Override
	public String deserialize(byte[] bytes) {
		return (bytes == null ? null : new String(bytes, charset));
	}

	@Override
	public byte[] serialize(Object object) {
		String string = object.toString();
		return (string == null ? null : string.getBytes(charset));
	}
}

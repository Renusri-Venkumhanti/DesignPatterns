package com.creational.design.patterns.builder.pattern;

public class HttpClient {
	String method;
	String userName;
	String passwod;
	String url;
	String body;
	String header;
	public HttpClient(HttpClientBuilder hb) {
		this.method = hb.method;
		this.userName = hb.userName;
		this.passwod = hb.passwod;
		this.url = hb.url;
		this.body = hb.body;
		this.header = hb.header;
	}
	public static class HttpClientBuilder{
		String method;
		String userName;
		String passwod;
		String url;
		String body;
		String header;
		
		public HttpClientBuilder method(String method) {
			this.method= method;
			return this;
		}
		public HttpClientBuilder secret(String userName, String password) {
			this.userName= userName;
			this.passwod = password;
			return this;
		}
		public HttpClientBuilder url(String url) {
			this.url = url;
			return this;
		}
		public HttpClientBuilder body(String body) {
			this.body = body;
			return this;
		}
		public HttpClientBuilder header(String header) {
			this.header = header;
			return this;
		}
		public HttpClient build() {
			return new HttpClient(this);
		}
	}
	@Override
	public String toString() {
		return "HttpClient [method=" + method + ", userName=" + userName + ", passwod=" + passwod + ", url=" + url
				+ ", body=" + body + ", header=" + header + "]";
	}

}

package com.vinilearning.thovn.model;

public class ThoVn {
	private final String tenbai;
	private final String tacgia;
	private final String urlTacGia;
	private final String urlTenBai;

	public String getTenbai() {
		return tenbai;
	}

	public String getTacgia() {
		return tacgia;
	}

	public String getUrlTacGia() {
		return urlTacGia;
	}

	public String getUrlTenBai() {
		return urlTenBai;
	}

	private ThoVn(ThoVnBuilder builder) {
		this.tenbai = builder.tenbai;
		this.tacgia = builder.tacgia;
		this.urlTacGia = builder.urlTacGia;
		this.urlTenBai = builder.urlTenBai;
	}

	public static class ThoVnBuilder {
		private String tenbai;
		private String tacgia;
		private String urlTacGia;
		private String urlTenBai;

		public ThoVnBuilder(String tenbai, String tacgia, String urlTenBai) {
			this.tenbai = tenbai;
			this.tacgia = tacgia;
			this.urlTenBai = urlTenBai;
		}

		public ThoVnBuilder setTenBai(String tenbai) {
			this.tenbai = tenbai;
			return this;
		}

		public ThoVnBuilder setTacGia(String tacgia) {
			this.tacgia = tacgia;
			return this;
		}

		public ThoVnBuilder setUrlTacGia(String urlTacGia) {
			this.urlTacGia = urlTacGia;
			return this;
		}

		public ThoVnBuilder setUrlTenBai(String urlTenBai) {
			this.urlTenBai = urlTenBai;
			return this;
		}
	}
}

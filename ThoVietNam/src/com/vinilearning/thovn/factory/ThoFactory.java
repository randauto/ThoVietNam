package com.vinilearning.thovn.factory;

import java.util.ArrayList;

import android.content.Context;

import com.vinilearning.thovn.model.MThoVn;
import com.vinilearning.thovn.model.MThoVn.ThoVnBuilder;

public class ThoFactory {
	private static ThoFactory instance;
	private Context context;

	public ThoFactory getInstance(Context context) {
		if (instance == null) {
			instance = new ThoFactory(context);
		}

		return instance;
	}

	private ThoFactory(Context context) {
		this.context = context;
	}

	public ArrayList<MThoVn> generation100ThoVn() {
		ArrayList<MThoVn> data = new ArrayList<MThoVn>();
		MThoVn mThoVn;
		ThoVnBuilder builder;
		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "Hồ Chí Minh",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Ngày Hòa bình đầu tiên", "Phùng Khắc Bắc",
				"ngayhoabinhdautien.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Những bóng người trên sân ga", "Nguyễn Bính",
				"nhungbongnguoitrensanga.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Tạm biệt Huế", "Thu Bồn",
				"tambiethue.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Vào chùa", "Đồng Đức Bốn",
				"vaochua.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Sư đoàn", "Phạm Ngọc Cảnh",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Chiếc xe xác qua phường Dạ Lạc", "Văn Cao",
				"chiecxexacquaphuongdalac.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Núi Đôi", "Vũ Cao",
				"nuidoi.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Bên kia sông Đuống", "Hoàng Cầm",
				"benkiasongduong.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Tràng Giang", "Huy Cận",
				"tranggiang.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 11.
		builder = new ThoVnBuilder("Dọn về làng", "Nông Quốc Chấn",
				"donvelang.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 12.
		builder = new ThoVnBuilder("Quê hương", "Nguyễn Bá Chung",
				"quehuong.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 13.
		builder = new ThoVnBuilder("Say đi em", "Vũ Hoàng Chương",
				"saydiem.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 14.
		builder = new ThoVnBuilder("Miền Trung", "Hoàng Trần Cương",
				"mientrung.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 15.
		builder = new ThoVnBuilder("Đường về quê mẹ", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 16.
		builder = new ThoVnBuilder("Anh đừng khen em", "Lâm Thị Mỹ Dạ",
				"anhdungkhenem.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 17.
		builder = new ThoVnBuilder("Nguyệt cầm", "Xuân Diệu",
				"nguyetcam.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 18.
		builder = new ThoVnBuilder("Cô bộ đội ấy đã đi rồi", "Phạm Tiến Duật",
				"cobodoiaydadiroi.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 19.
		builder = new ThoVnBuilder("Tây tiến", "Quang Dũng",
				"taytien.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 20.
		builder = new ThoVnBuilder("Lên Côn Sơn", "Khương Hữu Dụng",
				"lenconson.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 21.
		builder = new ThoVnBuilder("Đò lèn", "Nguyễn Duy",
				"dolen.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 22.
		builder = new ThoVnBuilder("Chiều", "Hồ Dzếnh",
				"chieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 23.
		builder = new ThoVnBuilder("Thăm mả cũ bên đường", "Tản Đà",
				"tammacubenduong.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 24.
		builder = new ThoVnBuilder("Cha tôi", "Lê Đạt",
				"chatoi.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 25.
		builder = new ThoVnBuilder("Mẹ và quả", "Nguyễn Khoa Điềm",
				"mevaqua.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 26.
		builder = new ThoVnBuilder("Núi mường Hung dòng sông Mã", "Cầm Giang",
				"nuimuonghungdongsongma.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 27.
		builder = new ThoVnBuilder("Mắt buồn", "Bùi Giáng",
				"matbuon.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 28.
		builder = new ThoVnBuilder("Hai sắc hoa tigôn", "T.T.Kh",
				"haisachoatigon.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 29.
		builder = new ThoVnBuilder("Đọc thơ Ức Trai", "Sóng Hồng",
				"docthouctrai.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 30.
		builder = new ThoVnBuilder("Bài thơ tình ở Hàng Châu", "Tế Hanh",
				"baithotinhohangchau.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("Nguyên Tiêu", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		return data;
	}
}

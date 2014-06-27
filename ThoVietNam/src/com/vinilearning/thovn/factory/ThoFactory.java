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

		// 31.
		builder = new ThoVnBuilder("Trở về quê nội", "Ca Lê Hiến",
				"trovequenoi.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 32.
		builder = new ThoVnBuilder("Đêm mưa", "Hoàn",
				"demmua.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 33.
		builder = new ThoVnBuilder("Những đứa trẻ chơi trước cửa đền", "Thi Hoàng",
				"nhungduatrechoitruocden.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 34.
		builder = new ThoVnBuilder("Cửu Long giang ta ơi", "Nguyên Hồng",
				"cuulonggiangtaoi.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 35.
		builder = new ThoVnBuilder("Đêm nay Bác không ngủ", "Minh Huệ",
				"demnaybackhongngu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 36.
		builder = new ThoVnBuilder("Nỗi niềm Thị Nở", "Quang Huy",
				"noiniemthino.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 37.
		builder = new ThoVnBuilder("Đường khuya trở bước", "Đinh Hùng",
				"duongkhuyatrobuoc.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 38.
		builder = new ThoVnBuilder("Người về", "Hoàng Hưng",
				"nguoive.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 39.
		builder = new ThoVnBuilder("Đồng chí", "Chính Hữu",
				"dongchi.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 40.
		builder = new ThoVnBuilder("Khi con tu hú", "Tố Hữu",
				"khicontuhu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 41.
		builder = new ThoVnBuilder("Lên Cấm sơn", "Thôi Hữu",
				"lencamson.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 42.
		builder = new ThoVnBuilder("Lời nói dối nhân ái", "Trang Thế Hy",
				"loinoidoinhanai.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 43.
		builder = new ThoVnBuilder("Gánh nước đêm", "Á Nam Trần Tuấn Khải",
				"ganhnuocdem.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 44.
		builder = new ThoVnBuilder("Tỳ bà", "Bích Khê",
				"tyba.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 45.
		builder = new ThoVnBuilder("Gửi bác Trần Nhuận Minh", "Trần Đăng Khoa",
				"guibactrannhuanminh.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 46.
		builder = new ThoVnBuilder("Thu điếu", "Nguyễn Khuyến",
				"thudieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 47.
		builder = new ThoVnBuilder("Bến Mi Lăng", "Yến Lan",
				"benmilang.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 48.
		builder = new ThoVnBuilder("Tháp Chàm", "Văn Lê",
				"thapcham.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 49.
		builder = new ThoVnBuilder("Ông đồ", "Vũ Đình Liên",
				"ongdo.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 50.
		builder = new ThoVnBuilder("Đèo cả", "Hữu Loan",
				"deoca.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 51.
		builder = new ThoVnBuilder("Viếng bạn", "Hoàng Lộc",
				"viengban.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 52.
		builder = new ThoVnBuilder("Tiếng thu", "Lưu Trọng Lư",
				"tiengthu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 53.
		builder = new ThoVnBuilder("Nhớ rừng", "Thế Lữ",
				"nhorung.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 54.
		builder = new ThoVnBuilder("Một vị tướng về hưu", "Nguyễn Đức Mậu",
				"motvituongvehuu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 55.
		builder = new ThoVnBuilder("Những mùa trăng mong chờ", "Lê Thị Mây",
				"nhungmuatrangmongcho.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 56.
		builder = new ThoVnBuilder("Dặn con", "Trần Nhuận Minh",
				"dancon.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 57.
		builder = new ThoVnBuilder("Hội Lim", "Vũ Đình Minh",
				"hoilim.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 58.
		builder = new ThoVnBuilder("Khóc người vợ hiền", "Tú Mỡ",
				"khocnguoivohien.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 59.
		builder = new ThoVnBuilder("Cuộc chia ly màu đỏ", "Nguyễn Mỹ",
				"cuocchialymaudo.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 60.
		builder = new ThoVnBuilder("Quê hương", "Giang Nam",
				"quehuonggiangnam.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 61.
		builder = new ThoVnBuilder("Thị Màu", "Anh Ngọc",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 62.
		builder = new ThoVnBuilder("Nhớ", "Hồng Nguyên",
				"nho.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 63.
		builder = new ThoVnBuilder("Trời và đất", "Phan Thị Thanh Nhàn",
				"troivadat.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 64.
		builder = new ThoVnBuilder("Người đàn bà ngồi đan", "Ý Nhi",
				"nguoidanbangoidan.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 65.
		builder = new ThoVnBuilder("Nhớ máu", "Trần Mai Ninh",
				"nhomau.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 66.
		builder = new ThoVnBuilder("Mẹ", "Nguyễn Ngọc Oánh",
				"me.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 67.
		builder = new ThoVnBuilder("Bông và mây", "Ngô Văn Phú",
				"bongvamay.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 68.
		builder = new ThoVnBuilder("Muôn vàn tình thân yêu trùm lên khắp quê hương", "Việt Phương",
				"muonvantinhthanyeutrumlenkhapquehuong.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 69.
		builder = new ThoVnBuilder("Đợi", "Vũ Quần Phương",
				"doi.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 70.
		builder = new ThoVnBuilder("Tên làng", "Y Phương",
				"tenlang.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 71.
		builder = new ThoVnBuilder("Lời mẹ dặn", " Phùng Quán",
				"loimedan.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 72.
		builder = new ThoVnBuilder("Có khi nào", "Bùi Minh Quốc",
				"cokhinao.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 73.
		builder = new ThoVnBuilder("Tự hát", "Xuân Quỳnh",
				"tuhat.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 74.
		builder = new ThoVnBuilder("Áo lụa Hà Đông", "Nguyên Sa",
				"aoluahadong.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 75.
		builder = new ThoVnBuilder("Bài thơ của một người yêu nước mình", "Trần Vàng Sao",
				"baithocuamotnguoiyeunuocminh.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 76.
		builder = new ThoVnBuilder("Người đẹp", "Lò Ngân Sủn",
				"nguoidep.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 77.
		builder = new ThoVnBuilder("Đồng dao cho người lớn", "Nguyễn Trọng Tạo",
				"dongdaochonguoilon.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 78.
		builder = new ThoVnBuilder("Tống biệt hành", "Thâm Tâm",
				"tongbiethanh.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 79.
		builder = new ThoVnBuilder("Dấu chân qua trảng cỏ", "Thanh Thảo",
				"dauchanquatrangco.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 80.
		builder = new ThoVnBuilder("Đất nước", "Nguyễn Đình Thi",
				"datnuoc.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 81.
		builder = new ThoVnBuilder("Những người đàn bà gánh nước sông ", "Nguyễn Quang Thiều",
				"nhungnguoidanbaganhnuocsong.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 82.
		builder = new ThoVnBuilder("Nghe tiếng cuốc kêu", "Hữu Thỉnh",
				"nghetiengcuockeu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 83.
		builder = new ThoVnBuilder("Bao giờ trở lại", "Hoàng Trung Thông",
				"baogiotrolai.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 84.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 85.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 86.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 87.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 88.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 89.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 1.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 2.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 3.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 4.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 5.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 6.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 7.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 8.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 9.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		// 10.
		builder = new ThoVnBuilder("", "",
				"nguyentieu.html").setUrlTacGia("");
		mThoVn = builder.build();
		data.add(mThoVn);

		return data;
	}
}

package tuan2TH;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

public class CD {
		private String CD;
		private String tuaCD;
		private Calendar ngayPH; 
		private double donGia;
		private int soBH;
		public String getCD() {
			return CD;
		}
		public void setCD(String cD) throws Exception {
			if( CD!=null)
			{
				this.CD = CD;
			}else throw new Exception("loi bull");
		}
		public String getTuaCD() {
			return tuaCD;
		}
		public void setTuaCD(String tuaCD) throws Exception {
			if (tuaCD!=null) {
				this.tuaCD = tuaCD;
			} else 
				throw new Exception("loi tuaCD");
		}
		public Calendar getNgayPH() {
			return ngayPH;
		}
		public void setNgayPH(Calendar NgayPH)throws Exception {
			if (NgayPH!=null) {
				this.ngayPH=NgayPH;
			} else throw new Exception("loi ngay"); 

		}
		public double getDonGia() {
			return donGia;
		}
		public void setDonGia(double donGia) throws Exception {
			if (donGia>0) {
				this.donGia = donGia;
			} else throw new Exception("loi don gia");
		}
		public int getSoBH() {
			return soBH;
		}
		public void setSoBH(int soBH) throws Exception {
			if (soBH>0) {
				this.soBH = soBH;
				
			}else throw new Exception("loi so baihat");
		}
		public CD(String CD, String tuaCD, Calendar NgayPH, double donGia, int soBH) throws Exception {
			if( CD!=null)
			{this.CD = CD;
			}else throw new Exception("loi bull");
			if (tuaCD!=null) {
				this.tuaCD = tuaCD;
			} else 
				throw new Exception("loi tuaCD");
			if (donGia>0) {
				this.donGia = donGia;
			} else throw new Exception("loi don gia");
			if (soBH>0) {
				this.soBH = soBH;
				
			}else throw new Exception("loi so bai hat");
			if (NgayPH!=null) {
				this.ngayPH=NgayPH;
			} else throw new Exception("loi ngay"); 
			}
		public CD() {
			// TODO Auto-generated constructor stub
		}
		//phuong thuc tinh getThanhTien()
		public double getThanhTien() {
			return getDonGia()*getSoBH();
		}
		//tạo tiêu đề và mẫu in kết quả
		
		public void inTieuDe() {
			System.out.printf("Test ket qua");
			for(int i=0;i<72;i++) 
				System.out.println("-");
			System.out.println();	
			System.out.printf("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12|\n"
					,"MaCD", "TuaCD","NgayPhatHanh","DonGia","Sobaihat","Tong tien");
			for (int i = 0;i<72;i++) {
				System.out.printf("-");
			System.out.println();
			}
			Locale lc=new Locale("vi","VN");
			DateFormat df=DateFormat.getDateInstance(1,lc);
			NumberFormat sf=NumberFormat.getCurrencyInstance(lc);
		}
		@Override
		public String toString() {
			String s="";
			DateFormat df = null;
			DateFormat sf = null;
			s+=String.format("|%-10s|%-10s|%-14s|%-10s|%-10s|%-12s\n",getCD(),getTuaCD(),df.format(getNgayPH().getTime()),sf.format(getDonGia()),getSoBH(),sf.format(getThanhTien()));
			return s;
			
		}
		
	}
	



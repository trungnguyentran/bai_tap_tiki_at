# bai_tap_tiki_at
Thực hành tìm vị trí element trên giao diện Website tiki.vn qua cách dùng XPath

Ta có Kịch bản Test Script cho Auto trên Website tiki.vn như sau:
1. Mở trang tiki.vn với trình duyệt chrome
2. Tìm kiếm sản phẩm asus 
a. Nhập chữ Asus vào ô textbox 
b. Nhấn nút tìm kiếm sản phẩm Asus
3. Chọn 1 sản phẩm Laptop dòng Asus bất kỳ
4. Thực hiện verify hiển thị thông tin sản phẩm có trên giao diện tiki 

Để tạo kịch bản test này, trước tiên ta xác định vị trí Element trên giao diện
**Bước 1:** 
Trước khi nhấn nút tìm kiếm:
+ Text box Search
+ Nút Tìm kiếm
+ Nút bỏ quả trên Popup "Đăng ký nhận ưu đãi và sản phẩm giá tốt nhất hàng ngày tại Tiki"

**Bước 2:** 
Sau khi nhấn nút tìm kiếm:
+ Ảnh sản phẩm Laptop Asus (bất kỳ do bạn muốn mua)

**Bước 3:** Nhấn ảnh Sản phẩm Laptop thì hiển thị chi tiết thông tin sản phẩm 
+ Tiêu đề sản phẩm
+ Giá bán
+ Ảnh sản phẩm
+ Thời gian bảo hành
+ Hình thức bảo hành
+ Nút chọn mua

**Yêu cầu:**
Tìm xpath vị trí các element cần dùng trong test script 

**Note**
+ Khi có vị trí element trên, dựa vào bài học Selenium tiếp theo để viết test script 

// lấy phần tử input 1
var dt1 = document.querySelector('input[name="ten_1"]');

// lấy phần tử input 2
var dt2 = document.querySelector('input[name="ten_2"]');

// lấy phần tử input 3
var dt3 = document.querySelector('input[name="ten_3"]');

// lấy phần tử input 4
var dt4 = document.querySelector('input[name="ten_4"]');

// tạo biến để hứng dữ liệu nhập vào
var a = 0;
var b = 0;
var c = 0;
var d = 0;

dt1.addEventListener('input', function() {
    a = Number(dt1.value);
    console.log('Đã nhập input 1:', dt1.value);
});

dt2.addEventListener('input', function() {
    b = Number(dt2.value);
    console.log('Đã nhập input 2:', dt2.value);
});

dt3.addEventListener('input', function() {
    c = Number(dt3.value);
    console.log('Đã nhập input 3:', dt3.value);
});

dt4.addEventListener('input', function() {
    d = Number(dt4.value);
    console.log('Đã nhập input 4:', dt4.value);
});

// tạo đối tượng button
var dt_button = document.querySelector("button");

// tạo đối tượng output
var dt_output = document.querySelector('input[id="out"]');

// tạo hàm tìm bội chung nhỏ nhất
function Ham_Tim_BCNN(bien1, bien2, bien3, bien4){
    // tạo biến bội chung nhỏ nhất
    var BCNN = 0;
    
    // tạo index bắt đầu
    var index_bat_dau = Math.max(bien1, bien2, bien3, bien4);

    // tạo index kết thúc
    var index_ket_thuc = bien1 * bien2 * bien3 * bien4;

    for (let i = index_bat_dau; i <= index_ket_thuc; i++) {
        let kiemTra1 = i % bien1 == 0 ? true : false;
        let kiemTra2 = i % bien2 == 0 ? true : false;
        let kiemTra3 = i % bien3 == 0 ? true : false;
        let kiemTra4 = i % bien4 == 0 ? true : false;
        
        if (kiemTra1 && kiemTra2 && kiemTra3 && kiemTra4) {
            BCNN = i;
            break;
        }
    }

    return BCNN;
}

dt_button.addEventListener('mousedown', function() {
    // gọi hàm tìm bội chung nhỏ nhất
    var x = Ham_Tim_BCNN(a, b, c, d);
    
    var str = `BCNN(${a}, ${b}, ${c}, ${d}) = ${x}`;

    console.log(str);

    dt_output.value = str;
});
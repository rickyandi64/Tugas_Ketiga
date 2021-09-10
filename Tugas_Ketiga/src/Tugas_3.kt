fun main(args: Array<String>) {
    var angka: String
    var teks : String
    print("Hallo Silahkan ketik mulai untuk menjalankan program: ")
    teks = readLine()!!
    while(teks == "mulai") {
        print("Masukan Angka Berapa saja kecuali 0 : ")
        angka = readLine()!!
        if(angka == "0") {
            break 
        }else{
            continue
        }
    }
}

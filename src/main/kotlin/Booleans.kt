fun main(){
    var nilai = 100
    var hasil : Char
    hasil = if(nilai <= 100 && nilai > 90){
        'A'
    } else if(nilai >80){
        'B'
    } else if(nilai > 70){
        'C'
    } else if(nilai > 60){
        'D'
    } else
    {
        'E'
    }

    print(hasil)
}
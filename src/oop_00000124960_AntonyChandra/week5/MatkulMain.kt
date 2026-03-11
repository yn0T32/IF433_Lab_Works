package oop_00000124960_AntonyChandra.week5

fun main(){
    val listMatkul: List<Matakuliah> = listOf(
        Wajib(),
        Elective()
    );

    println("Banyak tipe Matkul: $listMatkul");
    for(mku  in listMatkul){
        mku.set_matkul(3);
        if(mku is Wajib){
            mku.ada_seminar();
        } else if(mku is Elective){
            mku.ada_praktek();
        }
        when (mku) {
            is Elective -> {
                print("Elective dari when:")
                mku.ada_praktek();
            }
            is Wajib -> {
                print("Wajib dari When:")
                mku.ada_seminar();
            }
        }
    }
}

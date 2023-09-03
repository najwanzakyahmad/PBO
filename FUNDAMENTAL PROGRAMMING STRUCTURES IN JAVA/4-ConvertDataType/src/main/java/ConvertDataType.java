/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author ASUS
 */
public class ConvertDataType {
    static short methodOne(long l)
    {
        /*nilai variabel l diubah menjadi integer menggunakan metode casting,
        kemudian disimpan di variabel i*/
        int i = (int) l;
        /*mengembalikan nilai i ke main, tetapi sebelumnya nilai i diubah menjadi
        short menggunakan casting*/
        return (short)i;
    }
    public static void main(String[] args)
    {
        //mendeklarasi variabel d bertipe double, dengan nilai 10.25
        double d = 10.25;
        /*nilai variabel d diubah menjadi menjadi float dengan melakukan casting
        dan disimpan di variabel f*/
        float f = (float) d;
        /*nilai variabel f diubah menjadi long dengan menggunakan casting, kemudian 
        menjadi argumen ke metode methodeOne, setelah itu diubah lagi nilainya menjadi
        byte menggunakan casting, kemudian disimpan di varibel b*/
        byte b = (byte) methodOne((long) f);
        //menampilkan nilai dari b
        System.out.println(b);
    }
}

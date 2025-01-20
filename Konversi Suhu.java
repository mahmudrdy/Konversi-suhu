import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int jenisS, besarS,konver;
		int hasil=0;
		System.out.print("Jenis Suhu\n1. C \n2. K\n3. F\n4. R\nPilih	: ");
		jenisS=input.nextInt();
			if (jenisS ==1){
					System.out.print("Besar suhu	: ");
					besarS=input.nextInt();
					System.out.print("Di Konversi\n1. C \n2. K\n3. F\n4. R\nPilih	: ");
					konver=input.nextInt();
					if (konver ==1){
					hasil = besarS+5;
					}
					else if (konver==2){
						hasil=besarS+6;
						}
					else if (konver==3){
						hasil=besarS+7;
						}
					else if (konver==4){
						hasil=besarS+8;
						}
			}
		else if (jenisS==2){
					System.out.print("Besar suhu	: ");
					besarS=input.nextInt();
					System.out.print("Di Konversi\n1. C \n2. K\n3. F\n4. R\nPilih	: ");
					konver=input.nextInt();
					if (konver ==1){
						hasil = besarS+5;
						}
					else if (konver==2){
						hasil=besarS+6;
						}
					else if (konver==3){
						hasil=besarS+7;
						}
					else if (konver==4){
						hasil=besarS+8;
						}
			}
		else if (jenisS==3){
			System.out.print("Besar suhu	: ");
			besarS=input.nextInt();
			System.out.print("Di Konversi\n1. C \n2. K\n3. F\n4. R\nPilih	: ");
			konver=input.nextInt();
			if (konver ==1){
						hasil = besarS+5;
						}
			else if (konver==2){
						hasil=besarS+6;
						}
			else if (konver==3){
						hasil=besarS+7;
						}
			else if (konver==4){
						hasil=besarS+8;
						}
			}
		else if (jenisS==4){
			System.out.print("Besar suhu	: ");
			besarS=input.nextInt();
			System.out.print("Di Konversi\n1. C \n2. K\n3. F\n4. R\nPilih	: ");
			konver=input.nextInt();
			if (konver ==1){
				hasil = besarS+5;
				}
			else if (konver==2){
				hasil=besarS+6;
				}
			else if (konver==3){
				hasil=besarS+7;
				}
			else if (konver==4){
				hasil=besarS+8;
				}
			}
			
		System.out.print(hasil);
		
	}
}
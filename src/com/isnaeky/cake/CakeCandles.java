package com.isnaeky.cake;

class CakeCandles {

	public static int birthdayCakeCandles(int arr[]) {
		int coun = 0;
		int alto = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == alto) {
				coun = coun + 1;
			}
			if (arr[i] > alto  ) {
				alto = arr[i];
				coun = 0;
				coun = coun + 1;
			}
		}
		System.out.println("\n**********************************************************");
		System.out.println("Numero de velas del mismo nivel: " + coun + "\nNivel de vela a soplar: " + alto);
		return coun;
	}

}

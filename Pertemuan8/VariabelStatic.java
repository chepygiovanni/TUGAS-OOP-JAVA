class VariabelStatic {

	public static String jurusan;
	public static String name;

	VariabelStatic () {
		jurusan = "TIF";
		name = "Chepy";
	}

	public static void bakar() {
		System.out.println("KEBAKARAN!!! " + jurusan);
	}

	public int angka() {
		return 4;
	}

	public static void getName() {		
		System.out.println(name);
	}



}
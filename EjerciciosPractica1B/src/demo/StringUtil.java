package demo;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c, int n)
	{
		String palabraReplicada = "";

		for (int i = 0; i < n; i++) {
			palabraReplicada += c;
		}

		return palabraReplicada;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String palabraNueva = s;

		int cantLetrasAgregar = n - s.length();

		if (cantLetrasAgregar > 0) {
			palabraNueva = replicate(c, cantLetrasAgregar) + palabraNueva;
		}

		return palabraNueva;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] sArr = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			Integer aux = arr[i];

			sArr[i] = aux.toString();
		}

		return sArr;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] iArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			iArr[i] = Integer.parseInt(arr[i]);
		}

		return iArr;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int maxLong = -1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > maxLong)
				maxLong = arr[i].length();
		}

		return maxLong;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maxLong = maxLength(arr);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = lpad(arr[i], maxLong, c);
		}
	}
}

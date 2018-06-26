package IVPrograms;

import java.util.HashMap;

public class HashMapUniqueCharacter {

	public static void main(String[] args) {
		String test = "ADSADDLKSJKHSADFCODSJUPCJADSZZ;MCSAKCHDSLICDSCDSLKLJSCJLSAJCSDP10";
		String[] splittest = test.toLowerCase().trim().split("");
	//	System.out.println(splittest.toString());
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int Count = 1;

		for (int i=0 ; i < splittest.length ; i++)
		{
			if (map.containsKey((splittest[i])))
			{
				map.put(splittest[i], Count++);
			}
			else{
				map.put(splittest[i], 1);
			}

		}
		System.out.println(map);

		for (int i=0 ; i < splittest.length ; i++)
		{
			if (map.get(splittest[i]).equals(1))
			{
				System.out.println("Unique Character: " + splittest[i]);
			}
		}
	}

}

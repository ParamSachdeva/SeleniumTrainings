package IVPrograms;

import java.util.HashSet;

public class HashSetUniqueCharacter {

	public static void main(String[] args) {
		String test = "ADSADDLKSJKHSADFCODSJUPCJADSZZ;MCSAKCHDSLICDSCDSLKLJSCJLSAJCSDP10";
		String[] splittest = test.toLowerCase().trim().split("");

		HashSet<String> map = new HashSet<String>();

		for (int i=0 ; i < splittest.length ; i++)
		{
			if(map.contains(splittest[i]))
			{
				map.remove(splittest[i]);
			}
			else
			{
				map.add(splittest[i]);
			}
		}
		System.out.println("Unique Character: " + map);
	}

}

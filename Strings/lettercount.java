class Main
{
	public static void main(String args[])
	{
		String sr = "Hello All How are you doing $@2987";
	//count no of vowels ,capitals ,small,digits,spaces,symbols
		int capital=0,small=0,spaces=0,digit=0,symbol=0,vowel=0,consonant=0;
		for(int r=0;r<=sr.length()-1;r++)
		{
			char let=sr.charAt(r);
			if(let>='0' && let<='9')
				digit ++;
			else if(let==' ')
				spaces ++;
			else if (let>= 'a' && let<='z')
			{
				small++;
				if(let =='a' || let == 'e' || let=='i' || let=='o' || let=='u')
					vowel++;
				else
					consonant++;
			}
			else if ( let>='A' && let<='Z')
			{
				capital++;
				if(let=='A' || let=='E' || let=='I' || let=='O' || let=='U')	
					vowel++;
				else 
					consonant++;
			}
			else
				symbol++;
		}
		System.out.println(" total digits count is "+digit+" \n total capital letters count is "+capital +" \n small letters count is "+ small+" \n total spaces count is  " + spaces+" \n total symbols count is " + symbol+ " \n total vowels count is "+vowel+" \n total consonant count is "+consonant );
	}
}	
			
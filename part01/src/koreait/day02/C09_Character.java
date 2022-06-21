package koreait.day02;

public class C09_Character {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;

		// µÑ´Ù a·Î Ãâ·Â
		System.out.println("c1= " + c1);
		System.out.println("c2= " + c2);

		// ¹®ÀÚÄÚµå Á¤¼ö°ª Ãâ·Â -> int·Î Ä³½ºÆÃ :µÑ´Ù 97·Î Ãâ·Â
		System.out.printf("c1= %d\n", (int) c1);
		System.out.printf("c2= %d\n", (int) c2);// charÇüÀº %d·Î Ãâ·ÂÀÌ ºÒ°¡´ÉÇÔ

		// ¹®ÀÚÄÚµå Á¤¼ö°ªÀ» Ãâ·ÂÇÏ°í½Í´Ù¸é int·Î Ä³½ºÆÃÇÏ¸é µÊ
		c1 = (char) (c1 + 1); // µ¡¼À¿¬»ê °¡´É. ¿¬»ê°á°ú ´ëÀÔÇÒ ¶§´Â casting ÇÊ¿ä
		System.out.println("c1= " + c1);

		c1++; // ++dustksdms c1= c1+1, charÇü¿¡¼­´Â castingµµ ÇÔ
		System.out.println("c1= " + c1);

		// ÇÑ±Û¹®ÀÚ Å×½ºÆ® : ÇÑ±Û¹®ÀÚÄÚµå´Â 10Áø¼ö °ªÀ» 44032~55203, 16Áø¼ö(2Áø¼ö) ac00~d7a3
		char h1 = '°¡';
		char h2 = 44032;
		char h3 = '\uac00'; // \\u´Â 16Áø¼ö À¯´ÏÄÚµå, ac00Àº 16Áø¼ö '°¡' °ª

		System.out.println("h1= " + h1);
		System.out.println("h2= " + h2);
		System.out.println("h3= " + h3);

		System.out.printf("h1= %d\n", (int) h1);
		System.out.printf("h2= %d\n", (int) h2);
		System.out.printf("h3= %d\n", (int) h3);

		h1++;
		System.out.println("h1= " + h1);

		h1++;
		System.out.println("h1= " + h1);

		// ÇÑ±Û ¸¶Áö¸·¹®ÀÚ
		char h4 = 55203; // 10Áø¼ö Ç¥Çö¹æ¹ı
		char h5 = '\ud7a3'; // 16Áø¼ö Ç¥Çö, ÆR
		System.out.println("h4= " + h4);
		System.out.println("h5= " + h5);

		h4++; // ÇØ´çµÇ´Â ¸ğ¾çÀÇ ¹®ÀÚ°¡ ¾øÀ½. ?Ç¥½Ã
		System.out.println("h4= " + h4);

		h5--;// ÆQ
		System.out.println("h5= " + h5);
		System.out.println('H' + 'e' + 'l' + 'l' + 'o'); // °¢ ¹®ÀÚ ÄÚµåÀÇ °ªÀ» ´õÇÑ °á°ú°¡ ³ª¿È
		// hello ¸¦ Ãâ·ÂÇÏ°í½Í´Ù¸é charÀÇ ¹è¿­·Î Ã³¸®ÇØ¾ß ÇÔ.

	}

	// charÀÌ ¸ğ¿© ÇÑÁÙ·Î ³ª¶õÈ÷ ¼¼¿î´Ù¸é ¹®ÀÚ¿­ÀÌ µÊ.

}

/*
 * µ¥ÀÌÅÍ ±âº»Çü½Ä : ¹®ÀÚÇü char ¹®ÀÚµ¥ÀÌÅÍ¸¦ ÀúÀåÇÏ´Â 2 ¹ÙÀÌÆ® Çü½Ä. Á¤¼ö°ª 0~65535 ¹üÀ§ ÀúÀåµµ °¡´É. ÄÄÇ»ÅÍ¿¡¼­ ´Ù·ç´Â
 * ¹®ÀÚ´Â ¹®ÀÚÄÚµå·Î Ã³¸®µÇ´Âµ¥ ÄÚµå´Â Á¤¼ö°ªÀÓ ¹®ÀÚµ¥ÀÌÅÍ´Â ''±âÈ£¸¦ »ç¿ë. ('' ¾È¿¡´Â ¹®ÀÚ 1°³¸¸ °¡´É)
 * 
 * ¿µ¹®, ¼ıÀÚ, Æ¯¼ö¹®ÀÚ´Â ASCIIÄÚµå·Î Ç¥ÇöµÊ. ¿µ¹®ÀÚ, ¼ıÀÚ, Æ¯¼ö¹®ÀÚ ¿ÜÀÇ ´Ù±¹¾î ¹®ÀÚ´Â ¹®ÀÚ¸¦ Ã³¸®ÇÏ´Â ÀÎÄÚµù¹æ½Ä¿¡ µû¶ó ¹®ÀÚÄÚµå
 * °ªÀÌ ´Ù¸§. ±¹Á¦È­ ÀÎÄÚµùÀ¸·Î utf-8¹æ½ÄÀ» ¸¹ÀÌ »ç¿ëÇÔ.
 * 
 * 
 * °£: ¤¡ ¤¿ ¤¤ (ÃÊ¼º, Áß¼º, Á¾¼º °¢°¢¿¡ ÄÚµå°ªÀ¸·Î Á¶ÇÕÇÏ´Â Á¶ÇÕÇü)
 * 
 * utf-8 = ÇÑ±Û¿¡¼­ ³ª¿Ã ¼ö ÀÖ´Â ¸ğµç ÃÊ¼º Áß¼º Á¾¼ºÀÇ ¸ğµç Ç¥ÇöÀ» ¸¸µé¾î °¢°¢ ÄÚµå°ªÀ» ºÎ¿©ÇÏ´Â ¿Ï¼ºÇü
 */
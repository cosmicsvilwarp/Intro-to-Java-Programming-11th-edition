		/**************************************
		*            MyInteger                *
		*-------------------------------------*
		* +value: int                         *
		* +MyInteger(value: int)              *
		* +getValue(): int                    *
		* +isEven(): boolean                  *
		* +isOdd(): boolean                   *
		* +isPrime(): boolean                 *
		* +isEven(value: int): boolean        *
		* ----------------------------        *
		* +isOdd(value: int): boolean         *
		* ---------------------------         *
		* +isPrime(value: int): boolean       *
		* -----------------------------       *
		* +isEven(value: MyInteger): boolean  *
		* ----------------------------------  *
		* +isOdd(value: MyInteger): boolean   *
		* ---------------------------------   *
		* +isPrime(value: MyInteger): boolean *
		* ----------------------------------- *
		* +equals(value: int): boolean        *
		* +equals(value: MyInteger): boolean  *
		* +parseInt(chars: char[])            *
		* -----------------------             *
		* +parseInt(str: String)              *
		* ---------------------               *
		**************************************/
		// Implement MyInteger class
		public class MyInteger{
			int value;
			
			MyInteger(int value){
				this.value = value;
			}

			/** Return value */
			public int getValue(){
				return value;
			}

			/** Return true if value is even */
			public boolean isEven(){
				return isEven(value);
			}

			/** Return true if value is odd */
			public boolean isOdd(){
				return isOdd(value);
			}

			/** Return true if value is prime */
			public boolean isPrime(){
				return isPrime(value);
			}
			/** Return true if the specified value is even */
			public static boolean isEven(int value){
				return value % 2 == 0;
			}

			/** Return true if the specified value is odd */
			public static boolean isOdd(int value){
				return value % 2 != 0; 
			}
			/** Return true if specified value is prime */
			public static boolean isPrime(int value){
				for(int k = 2; k <= value / 2; k++){
					if(value % k == 0)
						return false;
				}
				return true;
			}

			/** Return true if the specified value is even */
			public static boolean isEven(MyInteger myinteger){
				return myinteger.isEven();
			}		
			/** Return true if the specified value is odd */
			public static boolean isOdd(MyInteger myinteger){
				return myinteger.isOdd();
			}
			/** Return true if specified value is prime */
			public static boolean isPrime(MyInteger myinteger){
				return myinteger.isPrime();
			}

			/** Return true is the value in this object 
			*   is equal to the specified value. */
			public boolean equals(int value){
				return this.value == value;
			}
			/** Return true if the value in this object 
			*   is equal to the specified value */
			public boolean equals(MyInteger myinteger){
				return this.value == myinteger.value;
			}		
			/** converts an array of numeric
			*   characters to an int value */
			public static int parseInt(char[] chars) {
				int answer = 0, factor = 1;
					for (int i = chars.length - 1; i >= 0; i--) {
						answer += (chars[i] - '0') * factor;
						factor *= 10;
					}
					return answer;
			}

			/** Converts a string into an int value */
			public static int parseInt(String str) {
				int answer = 0, factor = 1;
				for(int i = str.length() - 1; i >= 0; i--) {
					answer += (str.charAt(i) - '0') * factor;
					factor *= 10;
				}
				return answer;
			}
		}
	
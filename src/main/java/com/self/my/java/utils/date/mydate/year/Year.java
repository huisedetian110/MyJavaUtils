package com.self.my.java.utils.date.mydate.year;

public enum Year {
	/**
	 * January一月； 
	 * February二月； 
	 * March三月； 
	 * April 四月；
	 * May 五月；
	 * June 六月；
	 * July七月；
	 * August 八月；
	 * September 九月；
	 * October 十月；
	 * November 十一月；
	 * December十二月
	 */
	/**
	 * 一月
	 */
	JAN(MonType.BIG),
	/**
	 * 二月
	 */
	FEB(MonType.SPECIAL),
	/**
	 * 三月
	 */
	MAR(MonType.BIG),
	/**
	 * 四月
	 */
	APR(MonType.SMALL),
	/**
	 * 五月
	 */
	MAY(MonType.BIG),
	/**
	 * 六月
	 */
	JUN(MonType.SMALL),
	/**
	 * 七月
	 */
	JUL(MonType.BIG),
	/**
	 * 八月
	 */
	AUG(MonType.BIG),
	/**
	 * 九月
	 */
	SEP(MonType.SMALL),
	/**
	 * 十月
	 */
	OCT(MonType.BIG),
	/**
	 * 十一月
	 */
	NOV(MonType.SMALL),
	/**
	 * 十二月
	 */
	DEC(MonType.BIG);
	
	private Year(MonType type) {
		this.type = type;
	}
	
	/**
	 * 返回某一年的某一个月包含多少天
	 * @param year	某年
	 * @return
	 */
	public int containDays(int year){
		return type.countResult(year);
	}
	
	private final MonType type;
	
	private enum MonType implements Count{
		/**
		 * 大月：31天
		 */
		BIG{//相当于BIG(){}，无参可省略括号下类型

//			@Override
			public int countResult(int num) {
				return 31;
			}
		},
		/**
		 * 小月：30天
		 */
		SMALL{

//			@Override
			public int countResult(int num) {
				return 30;
			}
		},
		/**
		 * 特殊月份：2月(28/29天)
		 */
		SPECIAL{
//			@Override
			public int countResult(int num) {
				if((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)){
					return 29;
				}
				return 28;
			}
		};
	}
}

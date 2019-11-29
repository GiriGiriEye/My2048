
public class GameTest {
	//2048
	//新建一个二维数组
	static int[][] area = new int[6][6];
	
	public static void main(String[] args) {
		init();
		
	}
	
	//一些初始化和移动操作
	static void init() {
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				area[i][j] = 0;
			}
		}
		area[1][0] = 1;
		area[2][0] = 1;
		area[3][0] = 2;
		area[2][1] = 8;
		area[4][0] = 2;
		area[4][1] = 2;
		area[5][0] = 2;
		area[5][1] = 2;
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(area[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
//		System.out.println(area);
		w();
//		s();
//		l();
//		r();
//		w();
//		r();
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(area[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	//上移
	static void w() {
		for(int p = 0; p < 6; p++) {
			for(int i = 0; i < 6; i++)
	        {
	            for(int j = 0; j < 6; j++)
	            {
	                if(area[i][j] != 0)
	                {
	                    for(int k = i + 1; k <6; k++)
	                    {
	                        if(area[k][j] > 0) {
	                        	if(area[k][j] == area[i][j]) {
	                        		area[i][j] *= 2;
	                        		area[k][j] = 0;
	                        	}
	                        	else
	                        		break;
	                        }
	                    }
	                }
	
	            }
	            
	            
	        }
			for(int i = 0; i < 6; i++)
	        {
	            for(int j = 0; j < 6; j++)
	            {
					if (area[i][j] == 0)
			        {
			            for(int k = i; k < 6; k++)
			            {
			                if(area[k][j] == 0)
			                {
			                    continue;
			                }
			                else
			                {
			                	area[i][j] = area[k][j];
			                	area[k][j] = 0;
			                	break;
			                }
			            }
			        }
	            }
	        }
		}
		
	}
	
	//下移
	static void s() {
		for(int p = 0; p < 6; p++) {
			for(int i = 5; i > -1; i--)
	        {
	            for(int j = 0; j < 6; j++)
	            {
	                if(area[i][j] != 0)
	                {
	                    for(int k = i - 1; k > 0; k--)
	                    {
	                        if(area[k][j] > 0) {
	                        	if(area[k][j] == area[i][j]) {
	                        		area[i][j] *= 2;
	                        		area[k][j] = 0;
	                        	}
	                        	else
	                        		break;
	                        }
	                    }
	                }
	
	            }
	            
	            
	        }
			for(int i = 5; i > -1; i--)
	        {
	            for(int j = 0; j < 6; j++)
	            {
					if (area[i][j] == 0)
			        {
			            for(int k = i; k > -1; k--)
			            {
			                if(area[k][j] == 0)
			                {
			                    continue;
			                }
			                else
			                {
			                	area[i][j] = area[k][j];
			                	area[k][j] = 0;
			                	break;
			                }
			            }
			        }
	            }
	        }
		}
	}
	
	//左移
	static void l() {
		for(int p = 0; p < 6; p++) {
			for(int i = 0; i < 6; i++)
	        {
	            for(int j = 0; j < 6; j++)
	            {
	                if(area[j][i] != 0)
	                {
	                    for(int k = i + 1; k <6; k++)
	                    {
	                        if(area[j][k] > 0) {
	                        	if(area[j][k] == area[j][i]) {
	                        		area[j][i] *= 2;
	                        		area[j][k] = 0;
	                        	}
	                        	else
	                        		break;
	                        }
	                    }
	                }
	
	            }
	            
	            
	        }
			for(int i = 0; i < 6; i++)
	        {
	            for(int j = 0; j < 6; j++)
	            {
					if (area[j][i] == 0)
			        {
			            for(int k = i; k < 6; k++)
			            {
			                if(area[j][k] == 0)
			                {
			                    continue;
			                }
			                else
			                {
			                	area[j][i] = area[j][k];
			                	area[j][k] = 0;
			                	break;
			                }
			            }
			        }
	            }
	        }
		}
	}
	
	//右移
	static void r() {
		for(int p = 0; p < 6; p++) {
			for(int i = 5; i > -1; i--)
	        {
	            for(int j = 0; j < 6; j++)
	            {
	                if(area[j][i] != 0)
	                {
	                    for(int k = i - 1; k > 0; k--)
	                    {
	                        if(area[j][k] > 0) {
	                        	if(area[j][k] == area[j][i]) {
	                        		area[j][i] *= 2;
	                        		area[j][k] = 0;
	                        	}
	                        	else
	                        		break;
	                        }
	                    }
	                }
	
	            }
	            
	            
	        }
			for(int i = 5; i > -1; i--)
	        {
	            for(int j = 0; j < 6; j++)
	            {
					if (area[j][i] == 0)
			        {
			            for(int k = i; k > -1; k--)
			            {
			                if(area[j][k] == 0)
			                {
			                    continue;
			                }
			                else
			                {
			                	area[j][i] = area[j][k];
			                	area[j][k] = 0;
			                	break;
			                }
			            }
			        }
	            }
	        }
		}
	}
	
	//判断是否还能接着走，没做好，先就这样吧
	static boolean available() {
		boolean result = false;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(area[i][j] == 0) {
					result = true;
					break;
				}
			}
		}
		
		if(!result) {
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					if(area[i][j] == area[i + 1][j] || area[i][j] == area[i][j + 1]) {
						result = true;
						break;
					}
				}
			}
		}
		
		return result;
	}
	
}

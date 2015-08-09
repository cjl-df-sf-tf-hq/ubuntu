/*************************************************************************
	> File Name: Union.java
	> Author: 
	> Mail: 
	> Created Time: 2015年07月21日 星期二 22时50分17秒
 ************************************************************************/
//这是一个组合类，例如一共1-5五个元素，任意三个的组合
public class Union
{


    public int init(int []a,int i){
        if(i<a.length)
            return -1;
        else if(i==a.length)
            return 0;
        else{
            int j=0;
            for(;j<i;j++)
                a[j]=1;
            for(;j<a.length;j++)
                a[j]=0;
            return 1;
        }
    }
}

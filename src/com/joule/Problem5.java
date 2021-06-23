package com.joule;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        int ptr;
        int cnt=0;
        int ret=0;
        for(ptr=1; ptr>0; ptr<<=1)
            if((N&ptr) != 0) {
                break;
            }

        for(; ptr>0; ptr<<=1) {
            if((N&ptr) != 0) {
                ret = Math.max(cnt, ret);
                cnt=-1;
            }
            cnt++;
        }
        return ret;
    }
}

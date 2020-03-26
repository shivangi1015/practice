import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.

sockMerchant has the following parameter(s):

n: the number of socks in the pile
ar: the colors of each sock

For example, there are n=7 socks with a =[1,2,1,2,1,3,2] colors . There is one pair of color 1 and one of color 2.\
There are three odd socks left, one of each color. The number of pairs is 2.
 */
public class SockMerchant {

    static int numberOfPairs(int element, int[] ar) {
        int count = 0;
        for(int i: ar) {
            if(i == element){
                count += 1;
            }
        }
        return count / 2;
    }
    // Complete the sockMerchant function below.
    static int sockMerchant(int[] ar) {
        int numOfPair = 0;
        List<Integer> processedElement = new ArrayList<>();
        for(int element : ar) {
            if(!processedElement.contains(element))
                numOfPair += numberOfPairs(element, ar);
            processedElement.add(element);
        }
        return numOfPair;
    }

    static int solution2(int n, int[] socks) {
        Map<Integer, Integer> colors = new HashMap<>();
        for(int i = 0; i < n; i++) {
            Integer frequency = colors.get(socks[i]);
            if(frequency == null)
                colors.put(socks[i], 1);
            else
                colors.put(socks[i], frequency + 1);
        }
        int pairs = 0;
        for(Integer frequency : colors.values()) {
            pairs += (frequency >> 1);
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
//        System.out.println(sockMerchant(socks));
//        System.out.println(5 >> 1);
        System.out.println(solution2(9, socks));
    }
}

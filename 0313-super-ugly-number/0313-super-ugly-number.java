class Solution {
    class Item{
        long value;
        int index;
        int prime;
        public Item(long value, int index, int prime){
            this.value = value;
            this.index = index;
            this.prime = prime;
        }
    }
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp = new long[n];
        dp[0] = 1;
        PriorityQueue<Item> minHeap = new PriorityQueue<>(new Comparator<Item>(){
            public int compare(Item a, Item b){
                if(a.value == b.value){
                    return 0;
                }
                return a.value < b.value ? -1 : 1;
            }
        });
        for(int i = 0; i < primes.length; i++){
            minHeap.offer(new Item(primes[i], 1, primes[i]));
        }
        for(int i = 1; i < n; i++){
            dp[i] = minHeap.peek().value;
            while(minHeap.peek().value == dp[i]){
                Item current = minHeap.poll();
                minHeap.offer(new Item(current.prime * dp[current.index], current.index + 1, current.prime));
            }
        }
        return (int)dp[n - 1];
    }
}
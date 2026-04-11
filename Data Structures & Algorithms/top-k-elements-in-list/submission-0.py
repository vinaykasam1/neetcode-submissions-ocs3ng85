class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqMap  = {}
        for num in nums:
            freqMap[num] = freqMap.get(num, 0)+1
        
        arr = []
        for num, count in freqMap.items():
            arr.append([count, num])
        arr.sort()
        
        
        res =  []
        
        while len(res) < k:
            res.append(arr.pop()[1])
        
        return res
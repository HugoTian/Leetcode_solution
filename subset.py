class Solution:
    # @param S, a list of integer
    # @return a list of lists of integer
    def subsets(self, S):
        result = []
        for i in range(0,2**len(S)):
            if i==0 :
                result.append([])
            else:
                member = []
                for j in range(0,len(S)):
                    if i & (1 << j) == (1<<j) :
                        member.append(S[j])
                member.sort()
                result.append(member)
        return result
        
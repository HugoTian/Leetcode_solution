class Solution:
    # @param num, a list of integer
    # @return a list of lists of integer
    def subsetsWithDup(self, S):
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
        final_result = [];
        for i in range(0,len(result)):
            if result[i] not in result[i+1:len(result)]:
                final_result.append(result[i])
        return final_result
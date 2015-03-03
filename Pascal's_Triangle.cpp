class Solution {
public:
    vector<vector<int> > generate(int numRows) {
        vector<vector<int>> result;
        if(numRows>=1){
            vector<int> first;
            first.push_back(1);
            result.push_back(first);
            numRows--;
        }
       
        for(int i = 0; i <numRows ; i++){
            vector<int> line;
            line.push_back(1);
            for(int j=0 ; j<i;j++){
                int a = result.at(i).at(j);
                int b = result.at(i).at(j+1);
                line.push_back(a+b);    
            }
            line.push_back(1);
            result.push_back(line);
        }
        return result;
    }
};
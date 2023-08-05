class Solution {
public:
    bool isIsomorphic(string s, string t) 
    {
        map<char,char> m,n;

        for(int i=0; i<s.size(); i++)
        {
            if(m[s[i]]==NULL && n[t[i]]==NULL)
            {
                m[s[i]] = t[i];
                n[t[i]] = s[i];
            }
            else
            {
                if(m[s[i]]!=t[i] || n[t[i]]!=s[i])
                    return false;
            }
        }
        return true;
    }
};
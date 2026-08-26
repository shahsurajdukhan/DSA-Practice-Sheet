// What is Anagram? 
// Two strings are anagrams if they contain the same characters with the same frequencies.

#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

bool isAnagram(string str1, string str2) {
    // if lengths are diferent , they can't be anagrams
    if (str1.length() != str2.length()) {
        return false;
    }


    //sorting of both the strings
    sort(str1.begin() , str1.end());
    sort(str2.begin(),str2.end());

    //compare sorted strings
    return str1 == str2;
}

int main () {
    string str1 = "listen";
    string str2 = "silent";
    
    if (isAnagram(str1 , str2)) {
        cout << "Anagram" << endl;
    }

    else {
        cout << "Not an anagram"<< endl;
    }

    return 0;
}
#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

char firstNonRepeating(string str) {

    unordered_map<char , int> frequency;

    //count frequency
    for (char ch : str) {
        frequency[ch]++;
    }

    //Find first character with frequency 1
    for (char ch: str) {
        if (frequency[ch] == 1) {
            return ch;
        }
    }

    return '#';
}

int main () {
    string str = "aabbcde";

    char answer = firstNonRepeating(str);

    if (answer !='#') {
        cout << "First Non-repeating character: " << answer << endl;
    }
    else {
        cout << "No non-repating character found"<<endl;
    }

    return 0;
}
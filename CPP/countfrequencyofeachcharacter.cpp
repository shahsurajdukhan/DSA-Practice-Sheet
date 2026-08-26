#include <iostream>
#include <unordered_map>
#include <string>
using namespace std;

int main() {
    string str = "programming";

    unordered_map<char, int> frequency;

    for (char ch : str) {
        frequency[ch]++;
    }

    for (auto pair : frequency) {
        cout << pair.first << " : " << pair.second << endl;

    }

    return 0;
}
#include <iostream>
#include <vector>
using namespace std;

int findDuplicate(vector <int> & arr) {
    int n = arr.size();

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {

            if (arr[i] == arr[j]) {
                return arr[i];
            }
        }
    }

    return -1;
}

int main() {
    vector <int> arr = {1,3,4,2,3};

    int answer = findDuplicate(arr);

    if (answer != -1)
    cout << "Duplicate Element: "<< answer << endl;
    else 
    cout << "No Duplicate Element" <<endl;

    return 0;
}
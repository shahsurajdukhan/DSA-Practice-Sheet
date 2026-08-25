// #include <iostream>
// #include <vector>
// using namespace std;

// int removeDuplicates(vector<int>& arr) {
//     if (arr.empty())
//     return 0;


//     int j = 0;

//     for (int i = 1; i < arr.size(); i++) {
//         if (arr[i] != arr[j]) {
//             arr[++j] = arr[i];
//         }
//     }

//     return j + 1;
// }

// int main () {
//     vector <int> arr = {1,1,2,2,3,4,4};
//     int n = removeDuplicates(arr);

//     for (int i = 0; i < n; i++)
//     cout << arr[i] << " ";
    
//     return 0;
// }


// donkey method comes here

#include <iostream>
#include <vector>
using namespace std;

int main () {
    vector <int> arr = { 1,1,2,2,3,4,4};

    int flag = 0;

    for (int eyes=1; eyes<arr.size(); eyes++) {
        if (arr[eyes] != arr[flag]) {
            //new number found step flag forward, palce it
            flag = flag + 1;
            arr[flag]=arr[eyes];
        }
        // else : donkey does nothing , just moves his eyes forward
    }

    // print only the unique part: index 0 to flag 
    for (int i = 0; i <=flag; i ++) {
        cout << arr[i] << " ";
    }
}
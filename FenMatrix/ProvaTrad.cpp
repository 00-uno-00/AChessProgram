#include <iostream>
#include <cmath>
#include <string>
#include <array>

using namespace std;

int main(int argc, char const *argv[])
{
    char [8][8] board = {};
    int x = 0;
    int y = 0;
    int ind = 0;
    string FEN;


    cout << "Please paste the FEN string:" << endl;
    cin >> FEN;

    while(ind < FEN.length()){
        sub(0, FEN.find("/", 0, 1));
        for (int l = 0; l < 8; l++)
        {
            int spazio = FEN.find("/", 0, 1);
            board[l] = sub(FEN.substr(spazio, FEN.find("/", spazio + 1, 1)));
            for (int i = 0; i < 8; i++)
            {
                cout << board[i];
            }

        }
    }
    return 0;
}

char sub (string riga, char[] RB){
    for(int i = 0; i < riga.length(); i++)
    {
        std:: k = riga.find((string)i, 0, 1);
        if(k != std::string::npos)
        {
            RB[k] = riga.substr(k+1,1);
            riga.replace(k, 1, "");
        }
    }
    return RB;
}


#include <iostream>
#include <cmath>
#include <string>
#include <array>
using namespace std;

int main()
{
    string FEN, conv;
    string pos [8] [8] = { };
    int x = 0;
    int y = 0;
    int i = 0;
    int ind = 0;

    cout << "Please paste the FEN string:" << endl;
    cin >> FEN;

    while(ind<FEN.length())
    {

        FEN.replace(FEN.find("/", 0, 1),1,"");

        if(FEN.find("/", ind, 1) == -1 )
        {
            break;
        }
    }//conversione per rappresentazione
    ind = 0;
    while(ind<FEN.length())
    {
        FEN.replace(FEN.find("8", ind, 1), 1,"00000000");
        if(FEN.find("8", ind, 1) == -1)
        {
            break;
        }
    }//conversione per rappresentazione
    ind = 0;
    while(y<=8)
    {
        while (x<=8)
        {
            pos [x] [y] = FEN.substr(ind,1);
            ind++;
            x++;
        }
        cout<<pos [x] [y]<<endl;
        x = 0;

        ind = 0;
        y++;
    }//assegnare pezzi a posizioni
    y = 0;
    x = 0;
    //conv = FEN.substr(17,8);
    //FEN = FEN.substr(0,8) + FEN.substr(9,8) + FEN.substr(17,8) + FEN.substr(26,8);
    while(y<9)
    {
        while (x<9)
        {
            conv += pos [x] [y];
            x ++;
        }
        cout<<conv<<endl;
        x = 0;
        y ++;
    }//assegnare pezzi a posizioni*/

    return 0;
}

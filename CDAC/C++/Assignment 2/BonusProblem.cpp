#include<iostream>
using namespace std;
int level = 1;

namespace Engine::Audio{
    void playsound(string name){
        cout<<"Playing: "<<  name;
    }
}
int main(){
    int level = 0;
    cout<<"Local var :  "<< level << endl;
    cout<<"Global var : "  << ::level << endl;

    Engine::Audio::playsound("sword_clash");
}
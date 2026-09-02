#include<iostream>
#include<memory>
using namespace std;

class Shader{
    string name;
    string type;

    public:

    Shader(string name , string type) : name(name) , type(type) {
        cout<< "Shader Compiled" << endl ;
    }

    ~Shader(){
        cout<< "Shader Destroyed" << endl;
    }

    int getRefrenceCount(shared_ptr<Shader>& shader){
        return shader.use_count();
    }
};

int main(){

    shared_ptr<Shader> ptr1 = make_shared<Shader>("Main_Vert" , "vertex");
    // autp ptr1 = make_shared<Shader>();
    cout<<"Initial Count : "<< ptr1.use_count() << endl;

    {
        auto RenderRef = ptr1;
        cout<<"Count after RenderRef : "<< RenderRef.use_count() << endl;


        auto EditorRef = ptr1;
        cout<<"Count after RenderRef : "<< EditorRef.use_count() << endl;
    }

    cout<< "Count after curly braces : " << ptr1.use_count() << endl;

}
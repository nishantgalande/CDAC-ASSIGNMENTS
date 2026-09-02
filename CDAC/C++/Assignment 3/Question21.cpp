#include<iostream>
#include<memory>

using namespace std;

class Texture{
    string name;
    int width;
    int height;

public:

    // GETTER
    string getName() const {
        return this->name;
    }

    int getWidth() const {
        return this->width;
    }

    int geHeight() const{
        return this->height;
    }

    // SETTER

    void setName(const string& name){
        this->name = name;
    }

    void setWidth(int width) {
        this->width = width;
    }

    void setHeight(int heighth){
        this->height = height;
    }

    // CONSTRUCTOR

    Texture(string name , int width , int height) : name(name) , width(width) , height(height) {
        cout<< "Texture Loaded !" << endl;
    }

    //DESTRUCTOR
    ~Texture(){
        cout<< "Texture Released !" << endl;
    }

    void display() const {
        cout<< "Texture name : " << getName() << endl;
        cout<< "Texture height : " << geHeight()<< endl;
        cout<< "Texture width : " << getWidth()<< endl;
    }
};


int main(){

    auto text1 = make_unique<Texture>("Sprite", 512 , 512);
    // unique_ptr<Texture> text1 = make_unique<Texture>();
    text1->display();

    // unique_ptr<Texture> text2 = text1;   // *Error* -> Because the unique pointer means it share only 1 object at a time.
                                            // 1 Owner at a time . No one can share that object that object . Unique means only 1 . 
                                            // If we want to share that object with another pointer then we need to transfer the
                                            // ownership to another pointer so that the previous pointer automatically 
                                            // stores null pointer . The use_count for unique_ptr is always 1
    
    unique_ptr<Texture> text2 = move(text1);

    cout<< "Text1 is null: " << ((text1 == nullptr) ? "Yes" : "No") << endl;

}
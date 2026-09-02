#include<iostream>
using namespace std;

enum class HttpStatus{
    OK = 200,
    Created = 201,
    BadRequest = 400,
    Unauthorized = 401,
    NotFound = 404,
    ServerError = 500
};

void handleResponse(HttpStatus status , const string& endpoint){
    int code = static_cast<int> (status); // static cast

    switch(code){
        case 200:
            cout<< code << " OK\t : Request successful"  <<endl;
            break;
        case 201:
            cout<< code << " Created \t : Resource Created" << endl;
            break;
        case 400:
            cout<< code<< " Bad Request \t : Bad Request"  << endl;
            break; 
        case 401:
            cout<< code << " Unauthorized\t : Authentication required" << endl;
            break;
        case 404:
            cout<< code << " Not Found\t : Endpoint does not exist" << endl;
            break;
        case 500:
            cout<< code << " Server Error\t : Internal server error — retry later" << endl;
            break;
    };


}

int main(){
    
    string arr[] = {
        "[GET /api/users]",
        "[POST /api/users]",
        "[POST /api/login]",
        "[GET /api/profile]",
        "[GET /api/users/999]",
        "[GET /api/server]"
    };
    handleResponse(HttpStatus::OK,arr[0]);
    handleResponse(HttpStatus::Unauthorized, arr[3]);
    handleResponse(HttpStatus::NotFound,arr[4]);
    handleResponse(HttpStatus::ServerError,arr[5]);

}
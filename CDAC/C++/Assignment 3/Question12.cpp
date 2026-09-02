#include<iostream>
#include<vector>
#include<utility>
#include<string>

using namespace std;
using Header = pair<std::string,std::string>;
using HeaderList = vector<Header>;
using Port = unsigned int;
using IPAddress = string;
typedef unsigned long long RequestId;

void printHeaders(const HeaderList& headers){
    int size = headers.size();
    for(int i = 0;i< size ;i++){
        cout<< headers[i].first << " : " << headers[i].second;
        cout<< endl;
    }
}


int main(){
    HeaderList headers = {
        {"Content-Type", "application/json"},
        {"Authorization", "Bearer eyJhbGci..."},
        {"Accept-Language", "en-US"}
    };
   

    IPAddress ipAddress= "172.168.1.1";
    Port port = 8080;

    RequestId RID = 78478123;

    cout<< "RequestId : " << RID << endl;
    cout<< "Server Port : " << port;
    cout<< "Headers:" << endl;
    printHeaders(headers);

}
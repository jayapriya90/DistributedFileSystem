include "shared.thrift"

namespace java edu.umn.cs.distributedfilesystem

struct JoinResponse {
    1:required shared.State state;
    2:optional set<shared.NodeInfo> nodeInfos;
}

service SuperNodeRegistryService
{
    JoinResponse join(1:string hostname, 2:i32 port),
    shared.State postJoin(1:string hostname, 2:i32 port)
}
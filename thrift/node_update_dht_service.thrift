include "shared.thrift"

namespace java edu.umn.cs.distributedfilesystem

service NodeUpdateDHTService
{
    shared.State updateDHT(1:set<shared.NodeInfo> nodelist)
}
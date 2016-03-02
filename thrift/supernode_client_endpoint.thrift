include "shared.thrift"

namespace java edu.umn.cs.distributedfilesystem

service SuperNodeClientEndpoint {
     shared.NodeInfo getNode()
}

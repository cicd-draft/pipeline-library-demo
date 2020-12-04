def loadColors() {
    RED='\033[0;31m'
    BLUE='\033[0;34m'
    GREEN='\033[0;32m'
    NC='\033[0m'
}

def info(message){
    loadColors()
    sh """ set +x; echo -e "${GREEN}[INFO] - $message   ${NC}" """
}


def error(message){
    loadColors()
    sh """ set +x; echo -e "${RED}[ERROR] - $message   ${NC}" """
}
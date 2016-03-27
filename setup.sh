#! /bin/bash
# automatic setup script for TowerWarZ

# Do not touch these
WRK_SETUPSCRIPT=`pwd`/setup.sh
TWZ_VER=Dev



# If user wants help
# if [ $1 = "--help" ]
#   then
#     echo "Usage: $WRK_SETUPSCRIPT [ --custom-mvn <maven_location> ]"
#     echo "Items within [] are optional"
#     exit 0;
# fi
# # If user does not specify a maven location
# if [ $1 = "--custom-mvn" ] && [ $2 = "" ]
#   then
#     echo "<maven_location> is not specified! Exiting..."
#     exit 0;
# fi
#========================================== $1 might be empty and cause an error

    
# If user uses default maven location in $PATH
# if [1==1]
#   then
    command -v mvn >/dev/null 2>&1 || { 
      echo >&2 "Maven is not found on the system. Setup cannot be completed";
      exit 1;
    }
    echo "[Setup] Building TowerWarZ v$TWZ_VER"
    	if mvn clean install ; then
      echo "[Setup] Succesfully built TWZ v$TWZ_VER"
      echo "[Setup] Will now exit"
      exit 0;
   		 else
      echo "[Setup] Failed to build TWZ v$TWZ_VER"
      echo "[Setup] Please check the maven log for more details."
      echo "[Setup] If there is indeed a bug in the software and not the code, please file an issue at "
      echo "https://github.com/xiurobert/TowerWarZ/issues with your maven log trace."
      echo "Exiting..."
      exit 1;
    
		fi
# fi 
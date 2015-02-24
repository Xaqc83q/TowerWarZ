import CoreData
import random
class GatlingGunLv1(object):
    def StandardIssueMachineGun(object):
        GatlingGunLv1TotalCost=10
        GatlingGunLv1Cost=10
        GatlingGunLv1Dmg=int(randrange(1,5))
        GatlingGunLv1SplashRadius=0.01
        GatlingGunLv1ReloadRate=0.05
        GatlingGunLv1MissRate=int(randrange(0.1,0.2))

class GatlingGunLv2(object):
    def RefinedBarrelMachineGun(object):
        GatlingGunLv2TotalCost=40
        GatlingGunLv2UpgradeCost=30
        GatlingGunLv2Dmg=int(randrange(4,10))
        GatlingGunLv2SplashRadius=0.01
        GatlingGunLv2ReloadRate=0.05
        GatlingGunLv2MissRate=int(randrange(0.09,0.15))
class GatlingGunLv3(object):
    def RefinedBarrelAndFiringMechanism(object):

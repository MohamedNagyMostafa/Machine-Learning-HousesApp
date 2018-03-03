import matplotlib.pyplot as plt

plt.title("mintues visited pass")
factor = 1000
plt.plot( 90, 249000/ factor, "ro")
plt.plot( 101,338000/ factor,  "ro")
plt.plot( 200,400000/ factor,  "ro")
plt.plot( 500, 738000/ factor, "ro")
plt.plot( 650, 810000/ factor,  "ro")
plt.plot( 900,1986000/ factor,  "ro")
plt.plot( 1330, 2338000/ factor, "ro")
plt.xlabel('Size (ft)')
plt.ylabel('Price 1000s (Euro)')


plt.axis([0,1400,0,8000000/ factor])

plt.plot([90, 101, 200,500,650,900,1330],
	[181652.6301/ factor, 
	203653.134890000021/ factor,
	401657.678/ factor,
	1001671.4450000001/ factor,
	1301678.3284999998/ factor,
	1801689.801/ factor,
	2661709.5336999996/ factor])
#plt.figure() #separete hist
plt.show()
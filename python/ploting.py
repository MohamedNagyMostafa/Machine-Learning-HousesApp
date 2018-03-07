import matplotlib.pyplot as plt

plt.title("Iteration (7b)")
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
	[360261.087932185440/ factor,
363048.131562411140/ factor,
402502.217952793460/ factor,
680018.920337481400/ factor,
907851.819370845200/ factor,
1419535.610857591500/ factor,
2685489.477232783000/ factor,])
#plt.figure() #separete hist

plt.show()
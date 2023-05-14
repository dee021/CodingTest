while True:
    w = float(input())
    if w < 0:
        break
    print('Objects weighing {} on Earth will weigh {} on the moon.'.format('%0.2f' %w, '%0.2f' %(w*0.167)))
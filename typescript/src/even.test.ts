import isEven from './even'

describe('isEven', () => {
    it('should return true when input is 0', () => {
        expect(isEven(0)).toBe(true)
    })
    it('should return false when input is 1', () => {
        expect(isEven(1)).toBe(false)
    })
    it('should return true when input is 2', () => {
        expect(isEven(2)).toBe(true)
    })
    it('should return false when input is 3', () => {
        expect(isEven(3)).toBe(false)
    })
})